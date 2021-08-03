package org.zerock.quizpractice;

public class QuizService {

    public QuizDTO makeQuiz(){
//        int n1 = getNum();
//        int n2 = getNum();
//
//        QuizDTO quizDTO = new QuizDTO(n1, n2);
//        return quizDTO;
//
        return new QuizDTO(getNum(), getNum());
    }


    private int getNum(){
        return (int)(Math.random()*100)+1;
    }

    public boolean grading(QuizDTO quizDTO, int answer){

        int correctAnswer = quizDTO.getNum1() * quizDTO.getNum2();

        return answer == correctAnswer;
    }


}
