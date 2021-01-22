package demra;

import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class D1 {
	WebDriver dr;

	public void vv() {

		List<WebElement> we = dr.findElements(By.xpath(""));
		for (WebElement w : we) {
			String text = w.getText();
			if (text.contains("")) {
				System.out.println(w.getText());
				w.click();
			}

		}
	}

	public void bb() {
		WebElement e = dr.findElement(By.xpath(""));

		Alert al = dr.switchTo().alert();
		al.accept();
		al.dismiss();
		al.getText();

	}

	public void cc() {
		WebElement e = dr.findElement(By.xpath(""));
		Set<String> s = dr.getWindowHandles();
		java.util.Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			String childwindow = it.next();
		}
	}
}
