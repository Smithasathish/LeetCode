class Solution {
    public int compress(char[] chars) {
         int writeIndex = 0; // Index for writing compressed characters
        int readIndex = 0; // Index for reading consecutive repeating characters
        
        // Iterate through the array
        while (readIndex < chars.length) {
            // Get the current character to compress
            char currentChar = chars[readIndex];
            int count = 0; // Count of consecutive repeating characters
            
            // Count consecutive repeating characters
            while (readIndex < chars.length && chars[readIndex] == currentChar) {
                readIndex++; // Move to the next character
                count++; // Increment the count of consecutive repeating characters
            }
            
            // Write the character to the output array
            chars[writeIndex++] = currentChar;
            
            // If count is greater than 1, compress and write the count
            if (count > 1) {
                // Convert the count into characters and write to the output array
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[writeIndex++] = c;
                }
            }
        }
        
        // Return the new length of the compressed array
        return writeIndex;
        
    }
}
