package browser;

public class FactoryBrowser {

    public static IBrowser make(String typeBrowser) {
        IBrowser browser;
        switch (typeBrowser.toLowerCase()) {

            case "chrome":
                browser = new Chrome();
                break;
            case "owasp":
                browser = new ChromeZap();
                break;
            case "firefox":
                browser = new FireFox();
                break;
            default:
                browser = new Chrome();
                break;

        }
        return browser;
    }

}
