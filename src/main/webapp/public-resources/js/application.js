// Wait till the browser is ready to render the game (avoids glitches)
window.requestAnimationFrame(function() {
  new GameManager(4, KeyboardInputManager, HTMLActuator, LocalStorageManager, uploadScore);
});

function uploadScore(score) {
  $.ajax({
    type : "post",
    url : "/score/upload",
    data : {
      score : score
    },
    success : function(data) {
      if (data) {
        if (data.success == true) {
          console.info("upload success");
        } else {
          console.info("upload failure with code = " + data.errorMessage);
        }
      } else {
        console.error("Failed to upload");
      }
    },
    dataType : "json"
  });
};