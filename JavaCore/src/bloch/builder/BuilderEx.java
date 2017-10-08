package bloch.builder;

/**
 * Created by RomanR on 04-Aug-14.
 */
public class BuilderEx {
    private int el1;
    private int el2;
    private int el3;

    public BuilderEx(){}

    public static class Builder {
        private int el1;
        private int el2;
        private int el3 = 0;

        public Builder(int el1, int el2){
            this.el1 = el1;
            this.el2 = el2;
        }

        public Builder setEl3(int el3){
            this.el3 = el3;
            return this;
        }

        public BuilderEx build(){
            return new BuilderEx(this);
        }
    }

    private BuilderEx(Builder builder){
        this.el1 = builder.el1;
        this.el2 = builder.el2;
        this.el3 = builder.el3;
    }

    @Override
    public String toString() {
        return "BuilderEx{" +
                "el1=" + el1 +
                ", el2=" + el2 +
                ", el3=" + el3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BuilderEx)) return false;

        BuilderEx builderEx = (BuilderEx) o;

        if (el1 != builderEx.el1) return false;
        if (el2 != builderEx.el2) return false;
        if (el3 != builderEx.el3) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = el1;
        result = 31 * result + el2;
        result = 31 * result + el3;
        return result;
    }
}
