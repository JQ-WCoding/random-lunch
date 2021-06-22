$( document ).ready( function () {

    function getLocation() {
        if ( navigator.geolocation ) {
            navigator.geolocation.getCurrentPosition( function ( position ) {
                // 위도 경도 출력
                alert('위도: '+ position.coords.latitude + '/ 경도: ' + position.coords.longitude );

                geocoder.coord2Address(coord.getLng(), coord.getLat(), callback);
            } , function ( error ){
                console.error(error);
            },{
                // 배터리 소모를 이용해 더 정확한 위치값 찾기
                enableHighAccuracy : false,
                maximumAge : 0,
                // 그 이상 찾지 못하면 에러 발생
                timeout : Infinity
            });
        }else {
            alert('GPS정보 확인 불가 상태');
        }
    }

    $('#location').on("click", function (  ){
        getLocation();

    });

} );