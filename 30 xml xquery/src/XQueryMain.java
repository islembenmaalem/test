import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQPreparedExpression;
import javax.xml.xquery.XQResultSequence;
import net.sf.saxon.xqj.SaxonXQDataSource;

public class XQueryMain {
	public static void main(String[] args) {
		try {
			InputStream inputStream = new FileInputStream(new File("condition.xqy"));
			XQDataSource dataSource = new SaxonXQDataSource();
			XQConnection connection = dataSource.getConnection();
			XQPreparedExpression preparedExpression = connection.prepareExpression(inputStream);
			XQResultSequence resultSequence = preparedExpression.executeQuery();
			while (resultSequence.next()) {
				System.out.println(resultSequence.getItemAsString(null));
			}
		} catch (FileNotFoundException | XQException e) {
			e.printStackTrace();
		}
	}
}
