package Generators.JournalBlogPostGenerators;

import Generators.PathChooser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Nsyse on 2016-03-30.
 */
public class IBJournalGenerator extends BlogPostGenerator{
    public IBJournalGenerator(String journalTitle, String journalDescription) {
        super("InkBunny", journalTitle, journalDescription);
    }

    @Override
    public void overwriteSeleniumTest() {
        BufferedWriter outStream = null;
        try {
            outStream = new BufferedWriter(new FileWriter(PathChooser.defaultPath + this.getWebsiteName() + " journal upload " + this.getJournalTitle() + " ready test.html"));
            outStream.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            outStream.newLine();
            outStream.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">");
            outStream.newLine();
            outStream.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">");
            outStream.newLine();
            outStream.write("<head profile=\"http://selenium-ide.openqa.org/profiles/test-case\">");
            outStream.newLine();
            outStream.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />");
            outStream.newLine();
            outStream.write("<link rel=\"selenium.base\" href=\"https://inkbunny.net/\" />");
            outStream.newLine();
            outStream.write("<title>IB journal test</title>");
            outStream.newLine();
            outStream.write("</head>");
            outStream.newLine();
            outStream.write("<body>");
            outStream.newLine();
            outStream.write("<table cellpadding=\"1\" cellspacing=\"1\" border=\"1\">");
            outStream.newLine();
            outStream.write("<thead>");
            outStream.newLine();
            outStream.write("<tr><td rowspan=\"1\" colspan=\"3\">IB journal test</td></tr>");
            outStream.newLine();
            outStream.write("</thead><tbody>");
            outStream.newLine();
            outStream.write("<tr>");
            outStream.newLine();
            outStream.write("	<td>openWindow</td>");
            outStream.newLine();
            outStream.write("	<td>/</td>");
            outStream.newLine();
            outStream.write("	<td></td>");
            outStream.newLine();
            outStream.write("</tr>");
            outStream.newLine();
            outStream.write("<tr>");
            outStream.newLine();
            outStream.write("	<td>waitForPopUp</td>");
            outStream.newLine();
            outStream.write("	<td></td>");
            outStream.newLine();
            outStream.write("	<td>5000</td>");
            outStream.newLine();
            outStream.write("</tr>");
            outStream.newLine();
            outStream.write("<tr>");
            outStream.newLine();
            outStream.write("	<td>selectWindow</td>");
            outStream.newLine();
            outStream.write("	<td>title=Welcome | Inkbunny, the Furry Art Community</td>");
            outStream.newLine();
            outStream.write("	<td></td>");
            outStream.newLine();
            outStream.write("</tr>");
            outStream.newLine();
            outStream.write("<tr>");
            outStream.newLine();
            outStream.write("	<td>clickAndWait</td>");
            outStream.newLine();
            outStream.write("	<td>link=Journal</td>");
            outStream.newLine();
            outStream.write("	<td></td>");
            outStream.newLine();
            outStream.write("</tr>");
            outStream.newLine();
            outStream.write("<tr>");
            outStream.newLine();
            outStream.write("	<td>type</td>");
            outStream.newLine();
            outStream.write("	<td>id=title</td>");
            outStream.newLine();
            outStream.write("	<td>"+getJournalTitle()+"</td>");
            outStream.newLine();
            outStream.write("</tr>");
            outStream.newLine();
            outStream.write("<tr>");
            outStream.newLine();
            outStream.write("	<td>type</td>");
            outStream.newLine();
            outStream.write("	<td>id=content</td>");
            outStream.newLine();
            outStream.write("	<td>"+getJournalDescription()+"</td>");
            outStream.newLine();
            outStream.write("</tr>");
            outStream.newLine();
            outStream.write("");
            outStream.newLine();
            outStream.write("</tbody></table>");
            outStream.newLine();
            outStream.write("</body>");
            outStream.newLine();
            outStream.write("</html>");
            outStream.newLine();


        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                outStream.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
