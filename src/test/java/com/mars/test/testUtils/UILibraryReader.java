package testDemo;

import java.util.List;

public class UILibraryReader {
    private String name;
    private String activityName;
    private String pageDesc;
    private String desc;
    private List<Locator> locators;

    public List<Locator> getLocators() {
        return locators;
    }

    public UILibraryReader setLocators(List<Locator> locators) {
        this.locators = locators;
        return this;
    }

    public String getName() {
        return name;
    }

    public UILibraryReader setName(String name) {
        this.name = name;
        return this;
    }

    public String getActivityName() {
        return activityName;
    }

    public UILibraryReader setActivityName(String activityName) {
        this.activityName = activityName;
        return this;
    }

    public String getPageDesc() {
        return pageDesc;
    }

    public UILibraryReader setPageDesc(String pageDesc) {
        this.pageDesc = pageDesc;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public UILibraryReader setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    @Override
    public String toString() {
        return "UILibraryReader{" +
                "name='" + name + '\'' +
                ", activityName='" + activityName + '\'' +
                ", pageDesc='" + pageDesc + '\'' +
                ", desc='" + desc + '\'' +
                ", locators=" + locators +
                '}';
    }
}
