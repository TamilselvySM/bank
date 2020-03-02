$(document).ready(function () {

        $("#add").click(function () {
            var accountname = $("#a_name").val();
            var accountemail = $("#a_email").val();
            var accountage = $("#a_age").val();
            var accountphone = $("#a_phone").val();
            var accountbranch = $("#a_branch").val();
            $.post("add",
                    {
                        AccountName: accountname,
                        AccountEmail: accountemail,
                        AccountAge: accountage,
                        AccountPhone: accountphone,
                        AccountBranch: accountbranch
                    },
                    function () {
                        alert("Added Successfully");
                    });
        });

  
});