package example;
import spock.lang.Specification;


class ExcelReaderSpec extends Specification {
    ExcelReader excelReader = new ExcelReader()
    void "should read Excel Rows"(){
        given: "Rows to read"
        Integer numberOfRows = 5
        and: "An excel file"
        File excelFile = new File("src/test/resources/testing.xlsx")
        when:"We read rows"
        List<List<String>> result = excelReader.readRows(numberOfRows, excelFile)
        then: "We expect to get contant"
        result.size() == 4
        result.get(0) == ['Name', 'Email', 'Ranking']
        result.get(1) == ['josdem', 'josdem@gmail.com', '5.0']
        result.get(2) == ['eric', 'erich@gmail.com', '5.0']
        result.get(3) == ['martin', 'kmartin@gmail.com', '5.0']
    }
}
