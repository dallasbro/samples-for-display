Public Class Form1

    Dim scoresList As New List(Of Integer)
    Dim total As Integer = 0

    Private Sub btnAdd_Click(ByVal sender As System.Object, _
            ByVal e As System.EventArgs) Handles btnAdd.Click
        Try
            If IsValidData() Then
                Dim score As Integer = CInt(txtScore.Text)
                scoresList.Add(score)
                total += score
                Dim count As Integer = scoresList.Count
                Dim average As Integer = CInt(total / count)
                lblScoreTotal.Text = total.ToString
                lblScoreCount.Text = count.ToString
                lblAverage.Text = average.ToString
                txtScore.Select(0, txtScore.Text.Length)
            End If
        Catch ex As Exception
            MessageBox.Show(ex.Message & vbCrLf & vbCrLf _
                & ex.GetType().ToString & vbCrLf _
                & ex.StackTrace, "Exception")
        End Try
    End Sub

    Public Function IsValidData() As Boolean
        Return _
            IsPresent(txtScore, "Score") AndAlso _
            IsInt32(txtScore, "Score") AndAlso _
            IsWithinRange(txtScore, "Score", 0, 100)
    End Function

    Public Function IsPresent(ByVal textbox As TextBox, ByVal name As String) _
            As Boolean
        If textbox.Text = "" Then
            MessageBox.Show(name & " is a required field.", "Entry Error")
            textbox.Select()
            Return False
        Else
            Return True
        End If
    End Function

    Public Function IsInt32(ByVal textbox As TextBox, ByVal name As String) _
            As Boolean
        Try
            Convert.ToInt32(textbox.Text)
            Return True
        Catch ex As FormatException
            MessageBox.Show(name & " must be an integer.", "Entry Error")
            textbox.Select(0, textbox.Text.Length)
            Return False
        End Try
    End Function

    Public Function IsWithinRange(ByVal textbox As TextBox, ByVal name As String, _
            ByVal min As Decimal, ByVal max As Decimal) As Boolean
        Dim number As Decimal = CDec(textbox.Text)
        If number < min OrElse number > max Then
            MessageBox.Show(name & " must be between " & min & " and " _
                & max & ".", "Entry Error")
            textbox.Select(0, textbox.Text.Length)
            Return False
        Else
            Return True
        End If
    End Function

    Private Sub btnDisplay_Click(ByVal sender As System.Object, _
            ByVal e As System.EventArgs) Handles btnDisplay.Click
        scoresList.Sort()
        Dim scoresString As String = ""
        For Each i As Integer In scoresList
            scoresString &= i.ToString & vbCrLf
        Next
        MessageBox.Show(scoresString, "Sorted Scores")
        txtScore.Select()
    End Sub

    Private Sub btnClear_Click(ByVal sender As System.Object, _
            ByVal e As System.EventArgs) Handles btnClear.Click
        scoresList.Clear()
        total = 0
        txtScore.Text = ""
        lblScoreTotal.Text = ""
        lblScoreCount.Text = ""
        lblAverage.Text = ""
        txtScore.Select()
    End Sub

    Private Sub btnExit_Click(ByVal sender As System.Object, _
            ByVal e As System.EventArgs) Handles btnExit.Click
        Me.Close()
    End Sub

End Class
