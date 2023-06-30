package data;

public enum Language {
    UK("uk"),
    LU("lu"),
    MX("mx");

    private String language;
    Language(String language){
        this.language=language;
    }

    public String getLanguage() {
        return language;
    }
}
