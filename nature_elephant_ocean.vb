Option Explicit

Sub CleanUp()

Dim xShp As Shape
Dim strText As String
Dim MyRng As Range

On Error GoTo ErrHandler
If ActiveWindow.View.SplitSpecial <> 0 Then
    ActiveWindow.Panes(2).Close
End If

If ActiveWindow.View.SplitSpecial = 0 Then
    ActiveWindow.View.SplitSpecial = wdPaneNone
End If

On Error GoTo 0
For Each xShp In ActiveDocument.Shapes
    With xShp
        If .HasTextFrame Then
            If .TextFrame.HasText Then
                If .TextFrame.TextRange.Characters.Count > 1 Then
                    strText = .TextFrame.TextRange.Text
                    Set MyRng = .TextFrame.TextRange
                End If
            End If
        End If
    End With
   
    strText = RTrim(strText)
    strText = Replace(strText, Chr(13), " ")
    strText = Replace(strText, Chr(10), " ")
    strText = Replace(strText, Chr(7), " ")
    strText = Replace(strText, Chr(&H14), " ")
    strText = Replace(strText, Chr(160), " ")
    strText = Replace(strText, Chr(173), "-")
    strText = StrConv(strText, vbProperCase)
    strText = RTrim(strText)
    MyRng.Text = strText
Next xShp

ErrHandler:
    Exit Sub

End Sub