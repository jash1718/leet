 /*VALID PARENTHESES
  Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid...*/
 class Valid20 {
    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()
             ) {

            if(x=='('){
                
                stack.push(')');
            } else if (x=='{') {
                stack.push('}');
                
            } else if (x=='[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop()!=x) {

                return false;
            }

        }


        return stack.isEmpty();
        
    }
}