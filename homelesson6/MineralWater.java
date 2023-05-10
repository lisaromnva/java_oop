package homelesson6.product;
/*
 * Добавила еще один продукт не изменяя остального функционала
 */

public class MineralWater extends Drink {

    private String status;

    public MineralWater(String name, String status, float value) {
        super(name, value);
        this.status = status;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return String.format("%s  %s  %.1f", name, status, value);
    }
}