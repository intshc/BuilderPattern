package test1;

class Member {
    private Integer age;
    private String name;
    private Long id;
    private Boolean gender;

    public Member(MemberBuilder memberBuilder) {
        this.age = memberBuilder.age;
        this.id = memberBuilder.id;
        this.gender = memberBuilder.gender;
        this.name = memberBuilder.name;
    }
    public static MemberBuilder builder(){
        return new MemberBuilder();
    }

    static class MemberBuilder {
        private int age;
        private String name;
        private Long id;
        private boolean gender;

        public MemberBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public MemberBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public MemberBuilder setGender(Boolean gender) {
            this.gender = gender;
            return this;
        }

        public MemberBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public Member build() {
            return new Member(this);
        }


    }
}

class Test {
    public static void main(String[] args) {
        Member member = Member.builder()
                .setAge(12)
                .setId(1L)
                .setName("shin")
                .setGender(true)
                .build();

    }
}