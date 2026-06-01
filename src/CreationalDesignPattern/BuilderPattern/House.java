package CreationalDesignPattern.BuilderPattern;

public class House {
    String foundation;
    String roof;
    String structure;
    boolean hasGarage;
    boolean hasSwimmingPool;
    boolean hasGarden;

    private House(HouseBuilder builder){
        this.foundation=builder.foundation;
        this.roof=builder.roof;
        this.structure=builder.structure;
        this.hasGarage=builder.hasGarage;
        this.hasSwimmingPool=builder.hasSwimmingPool;
        this.hasGarden=builder.hasgarden;
    }

    public String toString(){
        return "House{"+"foundation= "+foundation+" roof= "+roof+
                " Structure= "+structure+" hasGarage= "+hasGarage+
                " hasSwimmingPool= "+hasSwimmingPool+" hasGarden= "
                +hasGarden+"}";
    }

    public static class HouseBuilder{
        private String foundation;
        private String roof;
        private String structure;
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasgarden;

        public HouseBuilder(String foundation, String roof, String structure){
            this.foundation=foundation;
            this.roof=roof;
            this.structure=structure;
        }

        public HouseBuilder setHasGarage(boolean hasGarage){
            this.hasGarage=hasGarage;
            return this;
        }

        public HouseBuilder setHasSwimmingPool(boolean hasSwimmingPool){
            this.hasSwimmingPool=hasSwimmingPool;
            return this;
        }

        public HouseBuilder setHasGarden(boolean hasGarden){
            this.hasgarden=hasGarden;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }
}
