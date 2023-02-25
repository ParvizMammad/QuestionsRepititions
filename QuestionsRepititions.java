import java.util.*;

public class QuestionsRepititions {
    public static void main(String[] args) {
        List<String> questionArray = new ArrayList<>();
        List<String> answerArray = new ArrayList<>();
        System.out.println("Exam has started...");
        Scanner sc = new Scanner(System.in);

        String answerQ1 = "A";
        String answerQ2 = "B";
        String answerQ3 = "C";
        String answerQ4 = "D";

        Collections.addAll(answerArray,answerQ1,answerQ2,answerQ3,answerQ4);

        var q1 = "What is the capital of France ?\nA)London\nB)Madrid\nC)Paris\nD)Roma";
        var q2 = ("Where is Ararat located? ?\nA)Armenia\nB)George\nC)Azerbaijan\nD)France");
        var q3 = ("Hottest Desert in the world ?\nA)Sahara\nB)Gobi\nC)Gipson\nD)Simpson1");
        var q4 = ("Jesus Christ has born where ?\nA)Paris\nB)Baku\nC)Istanbul\nD)Bethlehem");
        var q5 = ("Choose odd number ?\nA)10\nB)8\nC)9\nD)18");
        var q6 = ("Which number is bigger ?\nA)0,5\nB)0,8\nC)0,2\nD)0,9");
        var q7 = ("Calculate sin (30)  ?\nA)1/2\nB)1/3\nC)1/7\nD)1/4");
        var q8 = ("Find d of the algebraic sequence  ?\nA)1,3,4,7\nB)12,3,5,6\nC)2,5,8,11\nD)56,74,22,50");
        var q9 = "Which one is the tallest fall ?\nA)Niagara\nB)Annhel\nC)Victoria\nD)Albert";
        var q10 = ("Which one is linear function ?\nA)y=ax+bx+c\nB)y=kx+b\nC)y=log(x)\nD)y=cos(x)");

        Collections.addAll(questionArray, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10);
        Random random = new Random();


        int index1;
        int index2;
        int index3;
        int index4;
        int index5;
        int count = 0;
        double score = 0;
        for (int i = 0; i < questionArray.size(); i++) {


            count++;
            if (count <= 1) {
                index1 = random.nextInt(0, 2);
                index2 = random.nextInt(2, 5);
                index3 = random.nextInt(5, 7);
                index4 = random.nextInt(7, 9);
                index5 = random.nextInt(9, 10);

                System.out.println(questionArray.get(index1));
                String myVariant1 = sc.nextLine();

                if (!answerArray.contains(myVariant1)) {
                    throw new RuntimeException("Invalid Variant...");
                }

               else if (index1 == 0 && myVariant1.equals(answerQ3)) {
                    score++;
                    System.out.println("correct variant"+"\n"+score);

                } else if (index1 == 0 && myVariant1 != answerQ3) {
                    score = score - 0.25;
                    System.out.println("wrong variant!!" +"\n"+score);

                } else if (index1 == 1 && myVariant1 .equals(answerQ1)) {
                    score++;
                    System.out.println("correct variant" +"\n"+score);
                } else if (index1 == 1 && myVariant1 != answerQ1) {
                    score = score - 0.25;
                    System.out.println("wrong variant!!"+"\n"+score);

                }

                System.out.println(questionArray.get(index2));
                String myVariant2 = sc.nextLine();
                if (!answerArray.contains(myVariant2)){
                    throw new RuntimeException("Invalid Variant...");
                }

                 else if (index2 == 2 &&  myVariant2.equals(answerQ1)) {
                    score++;
                    System.out.println("correct variant"+"\n"+score);
                } else if (index2 == 2 && myVariant2 != answerQ1) {
                    score = score - 0.25;
                    System.out.println("wrong variant!!"+"\n"+score);

                } else if (index2 == 3 && myVariant2.equals(answerQ4)) {
                    score++;
                    System.out.println("correct variant"+"\n"+score);
                } else if (index2 == 3 && myVariant2 != answerQ4) {
                    score = score - 0.25;
                    System.out.println("wrong variant!!"+"\n"+score);

                } else if (index2 == 4 && myVariant2.equals(answerQ3)) {
                    score++;
                    System.out.println("correct variant"+"\n"+score);
                } else if (index2 == 4 && myVariant2 != answerQ3) {
                    score = score - 0.25;
                    System.out.println("wrong variant!!"+"\n"+score);

                }

                System.out.println(questionArray.get(index3));
                 String myVariant3 = sc.nextLine();

                if (!answerArray.contains(myVariant3)){
                    throw new RuntimeException("Invalid Variant...");
                }

               else  if (index3 == 5 && myVariant3.equals(answerQ4)) {
                    score++;
                    System.out.println("correct variant"+"\n"+score);
                } else if (index3 == 5 && myVariant3 != answerQ4) {
                    score = score - 0.25;
                    System.out.println("wrong variant!!"+"\n"+score);

                } else if (index3 == 6 && myVariant3.equals(answerQ1)) {
                    score++;
                    System.out.println("correct variant"+"\n"+score);

                } else if (index3 == 6 && myVariant3 != answerQ1) {
                    score = score - 0.25;
                    System.out.println("wrong variant!!"+"\n"+score);

                }

                System.out.println(questionArray.get(index4));
              String myVariant4 = sc.nextLine();

                if (!answerArray.contains(myVariant4)){
                    throw new RuntimeException("Invalid Variant...");
                }

             else  if (index4 == 7 && myVariant4.equals(answerQ3)) {
                    score++;
                    System.out.println("correct variant"+"\n"+score);
                } else if (index4 == 7 && myVariant4 != answerQ3) {
                    score = score - 0.25;
                    System.out.println("wrong variant!!"+"\n"+score);

                } else if (index4 == 8 && myVariant4.equals(answerQ2)) {
                    score++;
                    System.out.println("correct variant"+"\n"+score);

                } else if (index4 == 8 && myVariant4 != answerQ2) {
                    score = score - 0.25;
                    System.out.println("wrong variant!!"+"\n"+score);

                }


                System.out.println(questionArray.get(index5));
               String myVariant5 = sc.nextLine();

                if (!answerArray.contains(myVariant5)){
                    throw new RuntimeException("Invalid Variant...");
                }

                else if (index5 == 9 && myVariant5.equals(answerQ2)) {
                    score++;
                    System.out.println("correct variant");
                } else if (index5 == 9 && myVariant4 != answerQ2) {
                    score = score - 0.25;
                    System.out.println("wrong variant!!");
                }
            }
        }
        System.out.println("exam results="+score);
    }
}
