package model;

class SetInfoException extends Exception {

    private String message;

    SetInfoException(String message) {
        this.message = message;
    }

    String warnMess() {
        return message;
    }

}
