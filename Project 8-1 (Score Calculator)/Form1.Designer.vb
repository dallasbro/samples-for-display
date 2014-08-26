<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        If disposing AndAlso components IsNot Nothing Then
            components.Dispose()
        End If
        MyBase.Dispose(disposing)
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.btnClear = New System.Windows.Forms.Button
        Me.lblScoreTotal = New System.Windows.Forms.Label
        Me.Label4 = New System.Windows.Forms.Label
        Me.lblScoreCount = New System.Windows.Forms.Label
        Me.Label3 = New System.Windows.Forms.Label
        Me.btnDisplay = New System.Windows.Forms.Button
        Me.btnExit = New System.Windows.Forms.Button
        Me.btnAdd = New System.Windows.Forms.Button
        Me.lblAverage = New System.Windows.Forms.Label
        Me.txtScore = New System.Windows.Forms.TextBox
        Me.Label2 = New System.Windows.Forms.Label
        Me.Label1 = New System.Windows.Forms.Label
        Me.SuspendLayout()
        '
        'btnClear
        '
        Me.btnClear.Location = New System.Drawing.Point(135, 124)
        Me.btnClear.Name = "btnClear"
        Me.btnClear.Size = New System.Drawing.Size(88, 24)
        Me.btnClear.TabIndex = 49
        Me.btnClear.Text = "&Clear scores"
        '
        'lblScoreTotal
        '
        Me.lblScoreTotal.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblScoreTotal.Location = New System.Drawing.Point(95, 44)
        Me.lblScoreTotal.Name = "lblScoreTotal"
        Me.lblScoreTotal.Size = New System.Drawing.Size(40, 20)
        Me.lblScoreTotal.TabIndex = 48
        '
        'Label4
        '
        Me.Label4.Location = New System.Drawing.Point(15, 44)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(72, 16)
        Me.Label4.TabIndex = 47
        Me.Label4.Text = "Score total:"
        Me.Label4.TextAlign = System.Drawing.ContentAlignment.MiddleRight
        '
        'lblScoreCount
        '
        Me.lblScoreCount.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblScoreCount.Location = New System.Drawing.Point(95, 68)
        Me.lblScoreCount.Name = "lblScoreCount"
        Me.lblScoreCount.Size = New System.Drawing.Size(40, 20)
        Me.lblScoreCount.TabIndex = 46
        '
        'Label3
        '
        Me.Label3.Location = New System.Drawing.Point(15, 68)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(72, 16)
        Me.Label3.TabIndex = 45
        Me.Label3.Text = "Score count:"
        Me.Label3.TextAlign = System.Drawing.ContentAlignment.MiddleRight
        '
        'btnDisplay
        '
        Me.btnDisplay.Location = New System.Drawing.Point(23, 124)
        Me.btnDisplay.Name = "btnDisplay"
        Me.btnDisplay.Size = New System.Drawing.Size(96, 24)
        Me.btnDisplay.TabIndex = 44
        Me.btnDisplay.Text = "&Display scores"
        '
        'btnExit
        '
        Me.btnExit.DialogResult = System.Windows.Forms.DialogResult.Cancel
        Me.btnExit.Location = New System.Drawing.Point(151, 156)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(72, 24)
        Me.btnExit.TabIndex = 43
        Me.btnExit.Text = "E&xit"
        '
        'btnAdd
        '
        Me.btnAdd.Location = New System.Drawing.Point(151, 20)
        Me.btnAdd.Name = "btnAdd"
        Me.btnAdd.Size = New System.Drawing.Size(72, 24)
        Me.btnAdd.TabIndex = 42
        Me.btnAdd.Text = "&Add"
        '
        'lblAverage
        '
        Me.lblAverage.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblAverage.Location = New System.Drawing.Point(95, 92)
        Me.lblAverage.Name = "lblAverage"
        Me.lblAverage.Size = New System.Drawing.Size(40, 20)
        Me.lblAverage.TabIndex = 41
        '
        'txtScore
        '
        Me.txtScore.Location = New System.Drawing.Point(95, 20)
        Me.txtScore.Name = "txtScore"
        Me.txtScore.Size = New System.Drawing.Size(40, 20)
        Me.txtScore.TabIndex = 40
        '
        'Label2
        '
        Me.Label2.Location = New System.Drawing.Point(15, 92)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(72, 16)
        Me.Label2.TabIndex = 39
        Me.Label2.Text = "Average:"
        Me.Label2.TextAlign = System.Drawing.ContentAlignment.MiddleRight
        '
        'Label1
        '
        Me.Label1.Location = New System.Drawing.Point(15, 20)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(72, 16)
        Me.Label1.TabIndex = 38
        Me.Label1.Text = "Score:"
        Me.Label1.TextAlign = System.Drawing.ContentAlignment.MiddleRight
        '
        'Form1
        '
        Me.AcceptButton = Me.btnAdd
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.CancelButton = Me.btnExit
        Me.ClientSize = New System.Drawing.Size(244, 196)
        Me.Controls.Add(Me.btnClear)
        Me.Controls.Add(Me.lblScoreTotal)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.lblScoreCount)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.btnDisplay)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.btnAdd)
        Me.Controls.Add(Me.lblAverage)
        Me.Controls.Add(Me.txtScore)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Name = "Form1"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Score Calculator"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents btnClear As System.Windows.Forms.Button
    Friend WithEvents lblScoreTotal As System.Windows.Forms.Label
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents lblScoreCount As System.Windows.Forms.Label
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents btnDisplay As System.Windows.Forms.Button
    Friend WithEvents btnExit As System.Windows.Forms.Button
    Friend WithEvents btnAdd As System.Windows.Forms.Button
    Friend WithEvents lblAverage As System.Windows.Forms.Label
    Friend WithEvents txtScore As System.Windows.Forms.TextBox
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents Label1 As System.Windows.Forms.Label

End Class
