package JavaClass25Interfaces;

public interface Task2 {
    //Create a WebDriver Interface that will have the following unimplemented behaviour:
    // openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    // Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.openBrowser();
        chromeDriver.closeBrowser();
        chromeDriver.maximizeWindow();
        chromeDriver.findElement();

        FireFox fireFox = new FireFox();
        fireFox.openBrowser();
        fireFox.closeBrowser();
        fireFox.maximizeWindow();
        fireFox.findElement();

        WebDriver [] webDrivers = {new ChromeDriver(), new FireFox()};
        for (WebDriver w : webDrivers){
            w.closeBrowser();
            w.findElement();
            w.closeBrowser();
            w.maximizeWindow();
        }
    }
}
interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
   public void openBrowser(){ System.out.println("Chrome open browser");}
    @Override
    public void closeBrowser() { System.out.println("Chrome browser close");}
    @Override
    public void maximizeWindow() { System.out.println("Chrome maximise window");}
    @Override
    public void findElement() {System.out.println("Chrome find element");}}
class FireFox implements WebDriver{

    @Override
    public void openBrowser() {System.out.println("FireFox open browser");}
    @Override
    public void closeBrowser() {System.out.println("FireFox close browser");}
    @Override
    public void maximizeWindow() { System.out.println("FireFox maximise window");}
    @Override
    public void findElement() {System.out.println("FireFox find element");}}



