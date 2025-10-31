/// PTZ command types
enum PtzCommand {
  up(0),
  down(1),
  left(2),
  right(3),
  zoomIn(10),
  zoomOut(11);

  final int code;
  const PtzCommand(this.code);
}
