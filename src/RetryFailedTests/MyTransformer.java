package RetryFailedTests;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransformer implements IAnnotationTransformer{
	
	public void transform(ITestAnnotation testAnno, Class testClass, Constructor testConstructor, Method testMethod) {
			testAnno.setRetryAnalyzer(Retry.class);
		
	}

}
