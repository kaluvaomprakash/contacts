var methodType = map.rest.type;
methodType = methodType.toLowerCase();
print("method type " + methodType);
if (methodType != 'post') {
  var obj = map.template_op1;
  print("typeof(obj) " + typeof (obj));
  obj = JSON.parse(obj);
  print("obj bf delete " + JSON.stringify(obj));
  for (var a in obj) {
    var isobj = false;
    var newar = [];
    var len = a;
    if (obj[a] === '' || obj[a] === null || obj[a] === undefined) {
      delete obj[a];
    }
    else if (Array.isArray(obj[a])) {
      if (obj[a].length == 0) {
        delete obj[a]
      }
      else {
        var kd = obj[a];
        for (var a1 in obj[a]) {
          var ke = obj[a][a1];
          if (typeof (obj[a][a1]) == 'object') {
            isobj = true;
            //var kdkd = obj[a][a1];
            for (var keys1 in obj[a][a1]) {
              var keys3 = obj[a][a1][keys1];
              if (obj[a][a1][keys1] === '') {
                var keyssss = obj[a][a1][keys1]
                obj[a].splice(obj[a][a1], keys1);
              }
            }
          }
          else {
            if (obj[a][a1] == '') {
              obj[a].splice(a1);
            }
          }
        }
      }
    }
    else {
      for (var s2 in obj[a]) {
        if (obj[a][s2] === '') {
          delete obj[a][s2]
        }
      }
    }
    if (isobj) {
      obj[a] = newar;
    }
  }
  print("obj af delete " + JSON.stringify(obj));
  map.template_op1 = JSON.stringify(obj);
  print("map.template_op1 " + map.template_op1);
}