package org.example.code_smells.refactoring_techniques.part_4;

public class Replace_Parameter_with_Explicit_Methods {

    public class Printer {
        public void printDocument(String type, String content) {
            if ("text".equals(type)) {
                printTextDocument(content);
            } else if ("image".equals(type)) {
                printImageDocument(content);
            } else {
                System.out.println("Unknown document type: " + type);
            }
        }

        public void printTextDocument(String content){
            System.out.println("Printing text document: " + content);
        }

        public void printImageDocument(String content){
            System.out.println("Printing image document: " + content);
        }
    }
}
