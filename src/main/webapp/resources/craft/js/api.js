/**
 * Created by dailybird on 16/11/8.
 */
Mock.mock('api/v1/login', 'post', function(options){
    var request = requestParse(options.body);
    var username = request.username;
    var password = request.password;
    if(username == 'student' && password == 'student'){
        return {"msg" : "student"};
    }else if(username == 'teacher' && password == 'teacher'){
        return {"msg" : "teacher"};
    }else{
        return {"msg" : "error"};
    }
});

Mock.mock('g1.cn', {
    'name'     : '@name',
    'age|1-100': 1,
    'color'    : '@color'
});

function requestParse(request){
    var parsedRequest = {};
    var splitRequest = request.split('&');
    for(var item in splitRequest){
        var spiltItem = splitRequest[item].split('=');
        for (var pair in spiltItem)
            parsedRequest[spiltItem[0]] = spiltItem[1];
    }
    return parsedRequest;
}