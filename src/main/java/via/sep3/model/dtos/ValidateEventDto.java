package via.sep3.model.dtos;

public class ValidateEventDto {
    private byte[] validation;

    public ValidateEventDto(byte[] validation) {
        this.validation = validation;
    }

    public ValidateEventDto(){
    }

    public byte[] getValidation() {
        return validation;
    }

    public void setValidation(byte[] validation) {
        this.validation = validation;
    }
}
