//продукт
public class TheEleventhDoctor implements Doctor {

    public String getName() {
        return "Matt Smith";
    }

    public String getCompanionName() {
        return "Rory, Amy, Clara, River";
    }

    public String getEnimmiesName() {
        return "Daleks, weeping angels, Cybermen, The Silence";
    }

    public Integer getAge() {
        return 907;
    }

    public Double getScrewdriverVersion() {
        return 2.0;
    }
    public String getFavoriteWord() {
        return "\"Jeronimo!\"";
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("11 доктор умер, но он реинкарнирует в следующем сезоне, так что все в порядке");
    }
}
