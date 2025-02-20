import java.util.ArrayList;

public class Room {

    private class Dimension {
        private int width = 0, length = 0, height = 0;
    
        public int getWidth() {
            return width;
        }
    
        public void setWidth(int width) {
            this.width = width;
        }
    
        public int getLength() {
            return length;
        }
    
        public void setLength(int length) {
            this.length = length;
        }
    
        public int getHeight() {
            return height;
        }
    
        public void setHeight(int height) {
            this.height = height;
        }
    
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Width: ").append(Integer.toString(width))
            .append(" \n length: ").append(Integer.toString(length))
            .append("\n height: ").append(Integer.toString(height)).append("\n");
            return sb.toString();
        }
    }

    private int ID;
    private String name;
    private String loc;
    public Enums.RoomType type;
    private Dimension dimension;
    private ArrayList <Enums.Equipment> eq;
    private boolean status;

    private String tmtp_st(Enums.RoomType rm){
        switch (rm) {
            case OFFICE:
                return "OFFICE";
            case MAJLIS:
                return "MAJLIS";
            case G_STUDY:
                return "G_STUDY";
            case S_CASES:
                return "S_CASES";
            case M_CASES:
                return "M_CASES";
            case L_CASES:
                return "L_CASES";
            case AUDITORIUM:
                return "AUDITORIUM";
            case LAB:
                return "LAB";
            default:
                return "NONE";
        }
    }
   
    private String eq_st(ArrayList <Enums.Equipment> rm){
        String ans = "";
        for (Enums.Equipment equipment : rm) {
            switch (equipment) {
                case SMART_BOARD:
                    ans += "SMART_BOARD";
                    break;
                case WHITEBOARD:
                    ans += "WHITEBOARD";
                    break;
                case COMPUTERS:
                    ans += "COMPUTERS";
                    break;
                case PROJECTOR:
                    ans += "PROJECTOR";
                    break;
                default:
                    return "NONE";
            }
        }
        return ans;
    }

    

    public Room(int ID, String name, String loc, 
    Enums.RoomType type, int width, int length, int height, 
    ArrayList <Enums.Equipment> eq, boolean status){
        this.ID = ID;
        this.name = name;
        this.loc = loc;
        this.type = type;
        this.dimension = new Dimension();
        this.dimension.setWidth(width);
        this.dimension.setLength(length);
        this.dimension.setHeight(height);
        this.eq = eq != null ? eq : new ArrayList<Enums.Equipment>();
        this.status = status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public Enums.RoomType getType() {
        return type;
    }

    public void setType(Enums.RoomType type) {
        this.type = type;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
    public ArrayList <Enums.Equipment> getEq() {
        return eq;
    }

    public void setEq(ArrayList <Enums.Equipment> eq) {
        this.eq = eq;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString(){

        String s;
        if(this.status) s = "TRUE";
        else s = "FALSE";

        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(Integer.toString(this.ID))
        .append(" \n Name: ").append(this.name)
        .append(" \n Location: ").append(this.loc)
        .append(" \n Room Type: ").append(tmtp_st(this.type))
        .append(" \n Dimension: ").append(this.dimension.toString())
        .append(" \n Enums.Equipment:").append(eq_st(this.eq))
        .append(" \n Status: ").append(s).append("\n");
        return sb.toString();
    }
}