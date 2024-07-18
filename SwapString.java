class SwapString
{
public static void main(String args[])
{
String input = "hello world ok";
        
        // Split the input string into words
        String[] words = input.split(" ");
        
        // Reverse the words and join them with a space
        String output = words[2] + " " + words[1] + " " + words[0] ;
        
        // Print the result
        System.out.println(output);
}
}