package students.jana_sergejenko.lesson_8.level_4.task_15;


abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }


    abstract double calculateArea();

    abstract double calculatePerimeter();

}

