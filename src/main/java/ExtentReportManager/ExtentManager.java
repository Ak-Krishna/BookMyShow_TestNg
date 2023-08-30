package ExtentReportManager;

public class ExtentManager {
    private ExtentManager () {};

    private final static ThreadLocal<ExtentTest> threadLocal = new ThreadLocal<>();

    public static void setExtentTest(ExtentTest extentTest)
    {

        threadLocal.set(extentTest); // thread
    }

    public static ExtentTest getExtentTest()
    {

        return threadLocal.get();
    }
}
