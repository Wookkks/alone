let join = {
    template: `
        <div>
            <h3>component test</h3>
        </div>
    `
    ,
    data() {
        return {
            signup: {
                email: null,
                password: null,
            }
        }
    },
    methods: {

    }
}

$(function () {

    $('#btn-join').click(function (){
        let data = {
            email: $('#email').val(),
            password: $('#password').val(),

        }

        console.log("ajax")
        $.ajax({
            type: "POST",
            url: "/api/user/join",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "json",
        }).done(function (res){
            if(res.status === 500) {
                alert('회원가입 실패');
            } else {
                alert('회원가입 완료')
            }
            location.href = "/";
        }).fail(function (err) {
            alert(JSON.stringify(err));
        })

    })
})