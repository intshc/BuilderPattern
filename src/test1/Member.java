package test1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Member {
    private Long id;
    private Integer age;
    private String name;
    private Boolean gender;

    public Member(MemberBuilder memberBuilder) {
        this.id = memberBuilder.id;
        this.age = memberBuilder.age;
        this.name = memberBuilder.name;
        this.gender = memberBuilder.gender;
    }

    public static MemberBuilder builder() {
        return new MemberBuilder();
    }

    static class MemberBuilder{
        private Long id;
        private Integer age;
        private String name;
        private Boolean gender;

        public MemberBuilder setid(Long id){
            this.id=id;
            return this;
        }

        public MemberBuilder setage(Integer age){
            this.age=age;
            return this;
        }

        public MemberBuilder setname(String name){
            this.name=name;
            return this;
        }

        public MemberBuilder setgender(Boolean gender){
            this.gender=gender;
            return this;
        }
        public Member build(){
            return new Member(this);
        }
    }
}

class Test{
    public static void main(String[] args) {
        Member member1 = Member.builder()
                .setgender(true)
                .setage(24)
                .setid(1L)
                .setname("name")
                .build();
        System.out.println("member1 = " + member1);
    }
}