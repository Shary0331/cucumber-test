package utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class DataReaders {

    private static final Logger log = LoggerFactory.getLogger(DataReaders.class);

    public static void main(String[] args) {
        readXLS();
    }

    public static void readCSV() {
        String filename = "C:\\Users\\KLPO\\Downloads\\CucumberFramework\\src\\main\\resources\\UserAccounts.csv";
        List<String[]> records = CSVReaderDDT.get(filename);


        for (String[] record : records) {
            for (String field : record) {
                System.out.println(field);
            }
        }
    }

    public static void readXLS() {
        String filename = "C:\\Users\\KLPO\\Downloads\\CucumberFramework\\src\\main\\resources\\UserLogin.xls";
        String[][] data = ExcelReaderDDT.get(filename);

        for(String[] record : data){
            log.info("Record: " + record[0] + " : " + record[1] + " : " + record[2]);
//            System.out.println(record[0]);
//            System.out.println(record[1]);
//            System.out.println(record[2]);
        }
    }
}
