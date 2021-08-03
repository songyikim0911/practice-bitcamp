package org.zerock.quizpractice;

import lombok.AllArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
public class QuizUI {

    private Scanner scanner;
    private QuizService quizService;

    public void resolve(){
        System.out.println("문제를 푸시겠어요?");

        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("n")) {
            return;
        }

        QuizDTO quizDTO = quizService.makeQuiz();

        System.out.println(quizDTO.getNum1()+"*"+quizDTO.getNum2());

        System.out.println("정답을 입력하세요");

        int userAnswer = Integer.parseInt(scanner.nextLine());

        boolean result = quizService.grading(quizDTO, userAnswer);

        if(result){
            System.out.println("정답입니다.");
        }else{
            System.out.println("안됐지만..오답이야..");

        }
        this.resolve();
    }


}
