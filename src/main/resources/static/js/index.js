var myLocation = "";

$( document ).ready( function () {
    getLocation();

    console.log( myLocation );

    $( '#location' ).on( "click", function () {
        // jquery.ajax()
        $.ajax( {
            url: 'service/find2'
            , type: 'GET'
            , dataType: 'json'
            , data: {
                address: myLocation
            }
        } )

    } );
} );

function getLocation() {
    if ( navigator.geolocation ) {
        navigator.geolocation.getCurrentPosition( function ( position ) {
            // 위도 경도 출력
            //alert( '위도: ' + position.coords.latitude + '/ 경도: ' + position.coords.longitude );
            var geocoder = new kakao.maps.services.Geocoder();

            var coord = new kakao.maps.LatLng( position.coords.latitude, position.coords.longitude );

            var callback = function ( result, status ) {
                if ( status === kakao.maps.services.Status.OK ) {
                    //console.log( result[0].address.address_name );
                    setLocation( result[0].address.address_name );
                    console.log( "inner location : " + myLocation );
                }
            };

            geocoder.coord2Address( coord.getLng(), coord.getLat(), callback );

        }, function ( error ) {
            console.error( error );
        }, {
            // 배터리 소모를 이용해 더 정확한 위치값 찾기
            enableHighAccuracy: false,
            maximumAge: 0,
            // 그 이상 찾지 못하면 에러 발생
            timeout: Infinity
        } );
    } else {
        alert( 'GPS정보 확인 불가 상태' );
    }

}


function setLocation( txt ) {
    myLocation = txt;
}


