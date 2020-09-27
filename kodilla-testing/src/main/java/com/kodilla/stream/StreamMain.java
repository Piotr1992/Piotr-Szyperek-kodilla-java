package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
//import com.kodilla.stream.immutable.ForumUser;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

//import com.kodilla.stream.immutable.ForumUser;
import com.kodilla.stream.person.People;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.Forum;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void Method() {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
    }

    public static void MethodTask1Modulo71() {

        PoemBeautifier pb = new PoemBeautifier();

        //  Add code to begin and end text
        PoemDecorator assignCodeBeginAndEndText = (String tekst) -> "ABC"+tekst+"ABC";
        System.out.println("\nAdd code to begin and end text -> "+pb.beautify("xyz", assignCodeBeginAndEndText)+"\n");

        //  Change text to upper chars in text
        PoemDecorator changeLowerTextToUpperText = (tekst) -> tekst.toUpperCase();
        System.out.println("Change text to upper chars in text -> "+pb.beautify("java", changeLowerTextToUpperText)+"\n");

        //  Change text to lower chars in text
        PoemDecorator changeUpperTextToLowerText = (tekst) -> tekst.toLowerCase();
        System.out.println("Change text to lower chars in text -> "+pb.beautify("PROGRAMMER", changeUpperTextToLowerText)+"\n");

        //  Replace words in text
        PoemDecorator replaceWordsInText = (tekst) -> tekst.replace("John", "Alice").replace("dog", "cat");
        System.out.println("Replace words in text -> "+pb.beautify("John have a dog.", replaceWordsInText)+"\n");

    }

    public static void MethodTask1Modulo72() {
       //ForumUser fu = new ForumUser("as", "asf");
    }

    public static void main(String[] args) {

        Forum FU = new Forum();

        Map<Integer, ForumUser> usersForum = FU.getUserList().stream()
                .filter(men -> men.sex == 'M')
                .filter(age -> (LocalDate.now().getYear() - age.dateOfBirth.getYear()) >= 20 )
                .filter(post -> post.quantityPosts >= 1 )
                .collect(Collectors.toMap(ForumUser->ForumUser.userId, ForumUser->ForumUser));

        System.out.println("# elements: " + usersForum.size());
        usersForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }

}