//продукт
public class TheNinthDoctor implements Doctor {

    public String getName() {
        return "Christopher Eccleston";
    }

    public String getCompanionName() {
        return "Rose";
    }

    public String getEnimmiesName() {
        return "Daleks and The Bad Wolf";
    }

    public Integer getAge() {
        return 900;
    }

    public Double getScrewdriverVersion() {
        return 1.0;
    }

    public String getFavoriteWord() {
        return "\"Fantastic!\"";
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("9 доктор умер, но он реинкарнирует в следующем сезоне, так что все в порядке");
    }
}
