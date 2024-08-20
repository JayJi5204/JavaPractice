package lang.immutable.address;

public class ImmutableAddress {
    //내부 값 변경을 막기 위한 final 선언
    private final String structure;

    //생성자를 통해 값만 설정 가능
    public ImmutableAddress(String structure) {
        this.structure = structure;
    }

    //값을 변경할 수 있는 setStructure 제거
    public String getStructure() {
        return structure;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" + "structure='" + structure + '\'' + '}';
    }
}
