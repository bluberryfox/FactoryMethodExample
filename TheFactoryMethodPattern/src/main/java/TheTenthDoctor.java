//продукт
public class TheTenthDoctor implements Doctor {

    public String getName() {
        return "David Tennant";
    }

    public String getCompanionName() {
        return "Rose, Martha and Donna";
    }

    public String getEnimmiesName() {
        return "Daleks, Cybermen, The Master and weeping angels";
    }

    public Integer getAge() {
        return 906;
    }

    public Double getScrewdriverVersion() {
        return 1.0;
    }

    public String getFavoriteWord() {
        return "\"Allons-y!\"";
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("10 доктор умер, но он реинкарнирует в следующем сезоне, так что все в порядке");
    }
}
