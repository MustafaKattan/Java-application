package Shape;
import java.io.Serializable;
import java.util.HashMap;
public class Shape extends MyShapeService {
    private String shapeType;
    private  HashMap<String, String> shapeFields;
    private  HashMap<String, Double> shapeData;

    public String getShapeType() {
        return shapeType;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    public HashMap<String, String> getShapeFields() {
        return shapeFields;
    }

    public void setShapeFields(HashMap<String, String> shapeFields) {
        this.shapeFields = shapeFields;
    }

    public HashMap<String, Double> getShapeData() {
        return shapeData;
    }

    public void setShapeData(HashMap<String, Double> shapeData) {
        this.shapeData = shapeData;
    }
}
