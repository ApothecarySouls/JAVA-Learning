package Hierarchy;

public class PC extends Product
{
    private Long modelId;
    private String os;

    public PC() {
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void ring()
    {
        System.out.println("Ring ring ring!");
    }
}
