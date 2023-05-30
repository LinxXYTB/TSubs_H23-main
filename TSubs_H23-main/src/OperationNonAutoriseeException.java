// Exception personnalisée pour une opération non autorisée
//TODO 9
class OperationNonAutoriseeException extends Exception {

    public OperationNonAutoriseeException(String s) {
        super(s);
    }
}