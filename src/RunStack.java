import java.util.Scanner;
class Stack{
    final int MAX=10;
    int top;
    int[] stack;
    Scanner scan;
    Stack() {
        stack = new int[MAX];
        scan = new Scanner(System.in);
        top = -1;
    }
        void push()
        {
            if(top==MAX-1){
                System.out.println("overflow");
            }
            else{
                top++;
                System.out.println("Enter the element");
                stack[top]=scan.nextInt();
            }
        }
        void pop(){
            if(top==-1){
                System.out.println("underflow");
            }
            else{
                top--;
                System.out.println(stack[top]+" is deleted element");
            }
        }
        void traverse(){
            if(top==-1){
                System.out.println("Underflow");
            }else{
                for(int i=0;i<=top;i++){
                    System.out.print(stack[i] +" ");
                }
            }
        }
        void search(){
            int n,s=0,i;
            if(top==-1){
                System.out.println("underflow");
            }else{
                System.out.println("Enter the element to search");
                n =scan.nextInt();
                for(i=0;i<=top;i++){
                    if(n==stack[i]){
                        System.out.println("Element found at "+ i +" index");
                        s++;
                        break;
                    }

                }
                if(s==0){
                    System.out.println("Element not found........");
                }
            }
        }
    }
public class RunStack {
    public static void main(String[] args){
        int ch;
        String choice;
        Stack st=new Stack();
        do{
            System.out.println("1-Push\n2-Pop\n3-Traverse\n4-Search");
            System.out.println("Enter the choice between 1 to 4");
            ch=st.scan.nextInt();
            switch(ch){
                case 1:
                    st.push();
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.traverse();
                    break;
                case 4:
                    st.search();
                    break;

                default:
                    System.out.println("Wrong Choice");
            }
            System.out.println("Do You Want to continue (Y/N)");
            choice=st.scan.next();
        }while(choice.equalsIgnoreCase("y"));
    }
}
