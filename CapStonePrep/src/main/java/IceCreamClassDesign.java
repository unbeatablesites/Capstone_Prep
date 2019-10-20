public class IceCreamClassDesign {

    public int total;
    public int addTopping;
    public int normalScoop;
    public int addScoop;
    public String size;
    public boolean coneOrBowl;

    public IceCreamClassDesign(int total, int addTopping, int normalScoop, int addScoop, String size, boolean coneOrBowl) {
        this.total = total;
        this.addTopping = addTopping;
        this.normalScoop = normalScoop;
        this.addScoop = addScoop;
        this.size = size;
        this.coneOrBowl = coneOrBowl;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAddTopping() {
        return addTopping;
    }

    public void setAddTopping(int addTopping) {
        this.addTopping = addTopping;
    }

    public int getNormalScoop() {
        return normalScoop;
    }

    public void setNormalScoop(int normalScoop) {
        this.normalScoop = normalScoop;
    }

    public int getAddScoop() {
        return addScoop;
    }

    public void setAddScoop(int addScoop) {
        this.addScoop = addScoop;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isConeOrBowl() {
        return coneOrBowl;
    }

    public void setConeOrBowl(boolean coneOrBowl) {
        this.coneOrBowl = coneOrBowl;
    }
}
