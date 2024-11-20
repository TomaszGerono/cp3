public class ComputerFile {
    private String file_path;
    private String file_type;
    private int file_size;
    private String file_name;
    private String date_of_creation;
    private boolean file_opened;

    private void openFile() {
        this.file_opened = true;
    }

    private void closeFile() {
        this.file_opened = false;
    }

    private void displayProperties() {
        System.out.println(this.file_path + " " + this.file_type + " " + this.file_name);
    }

    private void displayPath() {
        System.out.println(this.file_path);
    }

    private void setName(String name) {
        this.file_name = name;
    }

    private String getName() {
        return this.file_name;
    }
}
