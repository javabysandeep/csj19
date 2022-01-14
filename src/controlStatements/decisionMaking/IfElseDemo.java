package controlStatements.decisionMaking;

public class IfElseDemo {
    public static void main(String[] args) {
        String fileType = "txt";
        if (fileType == "pdf") {
            System.out.println("pdf read logic");
        }
        if (fileType == "xls") {
            System.out.println("xls read logic");
        }
        if (fileType == "txt") {
            System.out.println("txt read logic");
        }
        if (fileType == "doc") {
            System.out.println("doc read logic");
        }


    }
}
