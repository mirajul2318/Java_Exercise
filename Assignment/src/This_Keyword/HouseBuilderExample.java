public class HouseBuilderExample {
    static class House {
        String material;
        int floors;

        static class Builder {
            House house = new House();

            Builder setMaterial(String material) {
                house.material = material;
                return this;
            }

            Builder setFloors(int floors) {
                house.floors = floors;
                return this;
            }

            House build() {
                return house;
            }
        }
    }

    public static void main(String[] args) {
        House house = new House.Builder().setMaterial("Bricks").setFloors(2).build();
        System.out.println("Material: " + house.material + "\nFloors: " + house.floors);
    }
}
