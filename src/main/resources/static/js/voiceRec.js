/**
 * This is the voice recording. 
 */


// success callback when requesting audio input stream
function successCallback(stream) {
    var audioContext = new (window.AudioContext)();

    // Create an AudioNode from the stream.
    var mediaStreamSource = audioContext.createMediaStreamSource( stream );

    // Connect it to the destination to hear yourself (or any other node for processing!)
    mediaStreamSource.connect( audioContext.destination );
}

function errorCallback() {
    console.log("The following error occurred: " + err);
}

navigator.webkitGetUserMedia( {audio:true}, successCallback, errorCallback );