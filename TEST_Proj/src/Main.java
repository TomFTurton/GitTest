public class Main {
    public static void main(String[] args) {
        Main test = new Main();
        test.printXs(17);
        test.printLetters('K');
        test.printLetters('M');
    }

    public void printXs(int n){
        if(n % 2 == 0){
            System.out.println("number is not odd, use other method!");
            return;
        }
        StringBuilder builder = new StringBuilder();

        int end = 1;
        int spaces = 80;

        for(int i = 1 ; i <= n ; i++){

            for (int k = 0 ; k < spaces ; k++){
                builder.append(" ");
            }
            builder.append("");
            for (int j = 0 ; j < end ; j++){
                builder.append("x");
            }
            System.out.println(builder.toString());
            builder.setLength(0);
            if(i > (n/2)){
                end -= 2;
                spaces++;
            }
            else {
                end += 2;
                spaces--;
            }
        }
    }

    public void printLetters(char letter){

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int index = alphabet.indexOf(letter) + alphabet.indexOf(letter);

        StringBuilder builder = new StringBuilder();

        int end = 1;
        int spaces = 80;

        for(int i = 0 ; i <= index ; i++){

            for (int k = 0 ; k < spaces ; k++){
                builder.append(" ");
            }
            builder.append("");
            for (int j = 0 ; j < end ; j++){
                if(j == 0)builder.append(alphabet.charAt(end/2));
                else if(j == end-1)builder.append(alphabet.charAt(end/2));
                else builder.append("-");
            }
            System.out.println(builder.toString());
            builder.setLength(0);
            if(i >= (index/2)){
                end -= 2;
                spaces++;
            }
            else {
                end += 2;
                spaces--;
            }
        }
    }
}
